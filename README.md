# The history APP

This Android app demonstrates a simple functionality related to famous people and their ages at death.

## Features

- Displays a list of famous people and their ages.
- Allows users to input an age and find out which famous person lived to that age or longer.

## Prerequisites

- Android Studio (latest version)
- Android SDK
- Basic knowledge of Android development

## Installation

1. Clone this repository to your local machine.
2. Open the project in Android Studio.
3. Build and run the app on an emulator or physical device.

## Usage

1. Launch the app.
2. Enter an age in the input field.
3. Click the "Submit" button.
4. The app will display the name of a famous person who lived to that age or longer.

## Contributing

Contributions are welcome! If you'd like to improve this app, feel free to submit a pull request.

## Understanding the Code

Our app revolves around `MainActivity`. This is where all the magic happens! It's in charge of managing user interactions and refreshing the UI.

Inside `MainActivity`, we've got a few key players:

- `ageInput`: This is an `EditText` field. Users can type in an age here.
- `submitButton`: This is a `Button`. When users click it, the app checks the age they typed into `ageInput`. Then, it updates the `resultss` TextView to show the name of a famous person who lived to that age or longer.
- `clearButton`: Another `Button`. When users click this one, it clears out the `ageInput` field.

When users click the `submitButton`, it gets to work. It looks at the age the user typed in and updates the `resultss` TextView based on that age. If the age isn't valid (less than 10 or greater than 100), it changes the text on the `submitButton` to ask the user to type in a valid age.

The `clearButton` has a simpler job. When users click it, it clears out the `ageInput` field. It also shows a quick toast message to let the user know that the input has been cleared.

## License

This project is licensed under the MIT License - see the LICENSE file for details.



