println "Please enter some text so I can play a game with you!"
String text = System.console().readLine()

int wordLength = text.length()

int i = 0
for (i = 0; i < wordLength; i++) {
  String letter; 
  letter = text.substring(i, i+1)
  println letter
}