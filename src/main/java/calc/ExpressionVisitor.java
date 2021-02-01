package calc;

public interface ExpressionVisitor <T>{
	T visitDivision(Division division);
	T visitMultiplication(Multiplication multiplication);
	T visitSubtraction(Subtraction subtraction);
	T visitAddition(Addition addition);
	

}

/*
Definieren Sie ein generisches Interface ExpressionVisitor mit einer eigenen Methode für jede konkrete Klasse aus dem abstrakten Syntaxbaum. 
Diese Methoden haben alle einen vollständig generischen Rückgabetyp, der durch Spezialisierung des Interfaces konkretisiert wird. 
Für die Klasse Division sieht die Signatur der Methode zum Beispiel so aus:
T visit Division(Division division).*/