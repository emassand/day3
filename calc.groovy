println "Please enter a number (type 'none' to finish): "
String str1 = System.console().readLine()
double num1 = Double.parseDouble(str1)

println "Thanks"
println "Please enter another number: "
String str2 = System.console().readLine()
double num2 = Double.parseDouble(str2)

println "Thanks."
println "What operation would you like to perform?"
println "Press '1' for addition"
println "Press '2' for subtraction"
println "Press '3' for multiplication"
println "Press '4' for division"

String option = System.console().readLine()
double opt = Double.parseDouble(option	)


double result = 0
if (opt == 1) { result = num1 +num2}
else if (opt == 2) { result = num1 -num2}
else if (opt == 3) { result = num1 *num2}
else if (opt == 4) { result = num1 /num2}

println "The result of your operation, given the numbers you entered is: " + result