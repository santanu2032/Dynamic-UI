cmake_minimum_required(VERSION 3.22.1)
project(sensory_ears_native)

# Relative path to step out of 'cpp' and enter the whisper submodule
set(WHISPER_DIR ${CMAKE_CURRENT_SOURCE_DIR}/../nativeInterop/whisper)

include_directories(${WHISPER_DIR}/include)
include_directories(${WHISPER_DIR}/src)

add_library(whisper SHARED
        # This will be your native entry point to pass mic arrays to the C++ core
        sensory_ears_jni.cpp

        # Core processing engine files
        ${WHISPER_DIR}/src/whisper.cpp
        ${WHISPER_DIR}/src/ggml.c
        ${WHISPER_DIR}/src/ggml-backend.c
        ${WHISPER_DIR}/src/ggml-alloc.c
        ${WHISPER_DIR}/src/ggml-quants.c
)

# Essential for logging sensory data or processing faults directly to Android Logcat
find_library(log-lib log)
if(log-lib)
    target_link_libraries(whisper ${log-lib})
endif()