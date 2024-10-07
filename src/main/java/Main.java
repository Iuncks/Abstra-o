// Classe abstrata Animal
abstract class Animal {
 protected String unome;
 // Construtor da classe abstrata
 public Animal(String nome) {
 this.unome = nome;
 }
 // Método abstrato (deve ser implementado pelas subclasses)
 public abstract void emitirSom();

 // Método concreto (opcionalmente pode ser sobrescrito pelas subclasses)
 public void dormir() {
 System.out.println(unome + " está dormindo.");
 }
}
// Subclasse Cachorro
class Cachorro extends Animal {
 public Cachorro(String nome) {
 super(nome);
 }
 // Implementação do método abstrato
 @Override
 public void emitirSom() {
 System.out.println(unome + " está latindo.");
 }
}
// Subclasse Gato
class Gato extends Animal {
 public Gato(String nome) {
 super(nome);
 }
 // Implementação do método abstrato
 @Override
 public void emitirSom() {
 System.out.println(unome + " está miando.");
 }
}
// Classe principal para executar o código
public class Main {
 public static void main(String[] args) {
 // Criação de objetos das subclasses
 Animal cachorro = new Cachorro("Rex");
 Animal gato = new Gato("Mimi");
 // Chamada de métodos
 cachorro.emitirSom(); // Saída: Rex está latindo.
 cachorro.dormir(); // Saída: Rex está dormindo.
 gato.emitirSom(); // Saída: Mimi está miando.
 gato.dormir(); // Saída: Mimi está dormindo.
 }
}
