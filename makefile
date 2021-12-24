Pet.class: Pet.java Attributes.class Happy.class Hungry.class Panda.class Play.class Thirsty.class
	javac -g Pet.java

Attributes.class: Attributes.java
	javac -g Attributes.java

Happy.class: Happy.java
	javac -g Happy.java

Hungry.class: Hungry.java
	javac -g Hungry.java

Panda.class: Panda.java
	javac -g Panda.java

Play.class: Play.java
	javac -g Play.java

Thirsty.class: Thirsty.java
	javac -g Thirsty.java

clean:
	rm *.class

run: Pet.class
	java Pet

debug: Pet.class
	jdb Pet

