int counter50 = 0
int counter20 = 0
int counter10 = 0
int counter5 = 0

int counter2 = 0
int counter1 = 0
int count5 = 0
int count2 = 0
int count1 = 0
int coun5 = 0
int coun2 = 0
int coun1 = 0

println "What was the cost of your purchase?"
String cost = System.console().readLine()
double price = (Double.parseDouble(cost))*100

println "What did you tender?"
String paid = System.console().readLine()
double tender = (Double.parseDouble(paid))*100

double change = tender - price

int remainder = 0

counter50 = change /5000
remainder = change%5000

counter20 = remainder /2000
remainder = remainder%2000
 
counter10 = remainder /1000
remainder = remainder%1000

counter5 = remainder /500
remainder = remainder%500

counter2 = remainder /200
remainder = remainder%200

counter1 = remainder /100
remainder = remainder%100

count5 = remainder /50
remainder = remainder%50

 count2 = remainder /20
 remainder = remainder%20

 count1 = remainder /10
 remainder = remainder%10

 coun5 = remainder /5
 remainder = remainder%5

 coun2 = remainder /2
 remainder = remainder%2

 coun1 = remainder /1
 remainder = remainder%1

println "Your change should be as follows:"
println "50s:" + counter50
println "20s:" +counter20
println "10s:" +counter10
println "5s:" +counter5
println "2s:" +counter2
println "1s:" +counter1
println "50p's:" +count5
println "20p's:" +count2
println "10p's:" +count1
println "5p's:" +coun5
println "2p's:" +coun2
println "1p's:" +coun1