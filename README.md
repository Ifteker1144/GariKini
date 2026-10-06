# GariKini

GariKini is an Android vehicle marketplace app built with **Kotlin** and **Jetpack Compose**. Users can log in, browse cars and bikes by category, and open a detail page for each vehicle.

## Features

- Login screen
- Home screen with a banner and featured vehicles
- Category screen to browse cars and bikes separately
- Detail screen showing vehicle images and information
- Screen-to-screen movement using Jetpack Compose Navigation
- Material 3 theme (colors, typography)

## Tech Stack

| Item | Details |
|---|---|
| Language | Kotlin |
| UI | Jetpack Compose (Material 3) |
| Navigation | Navigation Compose |
| Build system | Gradle (Kotlin DSL) |
| IDE | Android Studio |
| Package | `com.example.garikini` |

## Project Structure

```
GariKini/
├── app/src/main/java/com/example/garikini/
│   ├── MainActivity.kt          # Entry point and navigation setup
│   ├── model/
│   │   ├── VehicleModel.kt      # Vehicle data class and sample data
│   │   └── AdminData.kt         # Admin data
│   └── ui/
│       ├── LoginScreen.kt
│       ├── HomeScreen.kt
│       ├── DetailScreen.kt
│       ├── GenericScreens.kt
│       └── theme/
│           ├── CategoryScreen.kt
│           ├── Color.kt
│           ├── Theme.kt
│           └── Type.kt
├── app/src/main/res/drawable/   # Vehicle images and logo
├── build.gradle.kts
├── settings.gradle.kts
└── gradle/
```

## How to Run

### Requirements

- Android Studio (latest stable version recommended)
- JDK 17 or newer (the one bundled with Android Studio works)
- Android SDK installed through Android Studio
- An Android emulator or a physical device (Android 8.0+ recommended)

### Steps

1. **Clone the repository**

   ```bash
   git clone https://github.com/Ifteker1144/GariKini.git
   ```

2. **Open in Android Studio**

   `File > Open`, then select the cloned `GariKini` folder.

3. **Wait for Gradle sync**

   The first sync downloads dependencies and can take a few minutes.

4. **Select a device**

   Create an emulator from `Tools > Device Manager`, or connect a phone with USB debugging enabled.

5. **Run the app**

   Click the green **Run** button (or press `Shift + F10`).

### Build from the command line (optional)

```bash
./gradlew assembleDebug
```

On Windows:

```bash
gradlew.bat assembleDebug
```

The APK is generated at `app/build/outputs/apk/debug/`.

## Screenshots

<!-- Add screenshots here after uploading them to the repo, for example:
![Home](screenshots/home.png)
-->

## Troubleshooting

| Problem | Fix |
|---|---|
| `SDK location not found` | Open the project in Android Studio; it creates `local.properties` automatically. |
| Gradle sync fails | Check your internet connection, then `File > Sync Project with Gradle Files`. |
| Emulator is slow | Enable hardware acceleration (HAXM / Hyper-V) in your BIOS and SDK Manager. |

## Author

**Md Ifteker Uddin Chowdhury**
GitHub: [@Ifteker1144](https://github.com/Ifteker1144)

## License

This project is for educational purposes.
