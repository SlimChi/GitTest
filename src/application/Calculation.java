package application;

public class Calculation {
public static float calculate(float num1, float num2, String operator) {
	
	switch(operator)
	{
	case "+":
		return num1+num2;
	case "-":
		return num1-num2;
	case "x":
		return num1*num2;
	case "/":
		return num1/num2;
		default:
			return 0;
	}
}
}
