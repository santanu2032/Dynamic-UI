<div align="center">

# 🌀 Project Codex: UI & Motion Engine

**The core visual and mathematical rendering module for the Project Codex application.**

[![Kotlin](https://img.shields.io/badge/kotlin-%237F52FF.svg?style=for-the-badge&logo=kotlin&logoColor=white)](https://kotlinlang.org/)
[![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)](https://developer.android.com/)
[![Jetpack Compose](https://img.shields.io/badge/Jetpack_Compose-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white)](https://developer.android.com/jetpack/compose)

</div>

---

## 📖 Overview

This module acts as a specialized presentation and animation layer for **Project Codex**. It focuses on decoupling complex mathematical calculations—like circular motion and dynamic coordinate geometry—from standard UI state, allowing the main application to render high-performance, custom interfaces seamlessly.

> **Note:** This module heavily utilizes the Jetpack Compose `Canvas` API for high-performance custom drawing operations tailored to the Codex ecosystem.

## ✨ Key Features

- **🧮 Custom Math Engines:** Pluggable engines (e.g., `Circular Motion Engine`) designed to drive dynamic animations and visual feedback without cluttering the master app's state.
- **🎯 Modular Screen Logic:** Robust, standalone Kotlin functions for calculating device-agnostic metrics. 
  - *Example:* Dynamically calculating the exact `(x, y)` center of the screen to reliably anchor UI elements and animations.
- **🎨 Canvas Rendering:** Advanced use of Compose Canvas for drawing custom shapes (`DrawCustomCircle`) and tracking historical movement paths (`trailUI`).
- **🏗️ Clean Architecture:** Strict separation of concerns between the mathematical data generation and the Compose UI rendering layer, making it ready for integration into the larger Codex codebase.

## 🛠️ Tech Stack

* **Language:** [Kotlin](https://kotlinlang.org/)
* **UI Toolkit:** [Jetpack Compose](https://developer.android.com/jetpack/compose)
* **Build Configuration:** Gradle (Kotlin DSL `build.gradle.kts`)
* **Testing:** Fully supports both local JVM Unit Tests and Android Instrumented Tests to ensure UI reliability before merging to master.

---

## 💻 Code Highlight: Center Calculation

To ensure reliable rendering across different device screens, the engine relies on extracted, modular functions. Here is a conceptual look at how the center is handled to feed the motion engines:

```kotlin
@Composable
fun BackgroundUI() {
    val centerX = 1000f
    val centerY = 1000f

    // Each star: [x, y, speed]
    val stars = remember {
        mutableStateListOf(*Array(100) {
            floatArrayOf(
                (0..2000).random().toFloat(),
                (0..2000).random().toFloat(),
                (2..6).random().toFloat()
            )
        })
    }

    // Animation loop — runs every frame
    LaunchedEffect(Unit) {
        while (true) {
            withFrameMillis {
                for (i in stars.indices) {
                    val star = stars[i]
                    val dx = star[0] - centerX
                    val dy = star[1] - centerY
                    val dist = sqrt(dx * dx + dy * dy)

                    if (dist < 10f) {
                        // Star reached center — reset to random edge
                        stars[i] = floatArrayOf(
                            (0..2000).random().toFloat(),
                            (0..2000).random().toFloat(),
                            star[2]
                        )
                    } else {
                        // Move star toward center
                        val ratio = star[2] / dist
                        stars[i] = floatArrayOf(
                            star[0] - dx * ratio,
                            star[1] - dy * ratio,
                            star[2]
                        )
                    }
                }
            }
        }
    }

```

## 🚀 Integration Status
[x] Initial engine setup and Gradle configuration.

[x] Implement dynamic screen center calculation.

[x] Integrate basic trailUI and background tracking.

[x] Complete Circular Motion Engine integration.

[ ] Finalize testing and merge into Project Codex master branch.

