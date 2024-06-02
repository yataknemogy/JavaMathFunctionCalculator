# Mathematical Function Calculator

This project is a Java application that calculates a specific mathematical function based on the input value. The function uses trigonometric and logarithmic calculations to determine the result.

## Overview

The project contains the following components:

- `Function` class: This class calculates the value of the function based on the input. It uses logarithmic and trigonometric classes for its calculations.
- `logarithm` class: Provides methods for calculating logarithms both approximately using a series expansion and precisely using the `Math.log` function.
- `trigonometry` class: Contains nested classes for trigonometric functions, including sine, cosine, secant, and cosecant. Each nested class provides methods for calculating these functions approximately using series expansions and precisely using `Math` methods.

## Function Calculation

The `Function` class calculates the value of the function as follows:

- If `x < 0`, it calculates the value using the secant and cosecant functions.
- If `x > 0`, it calculates the value using various logarithmic functions.
- If `x == 0`, it calculates the value using the secant and cosecant functions.

## License

This project is licensed under the MIT License - see the `LICENSE` file for details.
