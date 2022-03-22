package oopFour;

public abstract class Shape {
    protected abstract double circumference ();
    protected abstract double area ();

}
//        1.Napraviti apstraktnu klasu Shape
//        2. Napraviti child klase: Circle, Rectangular, Triangle
//        3. Unutar Shape klase napraviti abstract metode za racunanje obima i povrsine koje nemaju implementaciju
//        a u klasama Circle/Rectangular/Triangle napraviti konkretnu implementaciju za obim i povrsinu
//        4. Metode obim i povrsina ne bi trebale primati nikakve argumente, nego bi se potrebni atributi za njih set-ali
//        prilikom poziva konstruktora kad se kreiraju objekti ovih child klasa
//        5. U mainu napraviti menu tako da user sa inputa moze da specificira N puta bilo koji tip (circle, rectangular, triangle)
//        i odgovarajuce vrijednosti za koje ce se racunati obim i povrsina
//        6. Sve sto user provide-a na inputu, smjestiti u ArrayListu i iterirati kroz elemente i izracunati obim i povrsinu
//        7. U metodama za racunanje obima i povrsine napraviti da bacaju exception ako je vrijednost koju daju negativna
//        (nema smisla da je obim i povrsina negative value)
//        8. U main metodi, prilikom poziva ovih metoda, napraviti try/catch blok koji ce hendlati situaciju ako racunanje obima
//        ili povrsine za bilo koji shape rezultira negativnim
//        rezultatom tako da se petlja dalje moze izvrsavati i da se mogu racunati obim i povrsina za ostale elemente u ArrayListi
