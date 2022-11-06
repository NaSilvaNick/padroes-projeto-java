package dio.gof.singleton;

public class Test {

  public static void main(String[] args) {

    // Testes relacionados ao Design Pattern Singleton;

    SingletonLazy lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);
    lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);

    System.out.println("\n");

    SingletonEager eager = SingletonEager.getInstancia();
    System.out.println(eager);
    eager = SingletonEager.getInstancia();
    System.out.println(eager);

    System.out.println("\n");

    SingletonLazyHolder LazyHolder = SingletonLazyHolder.getInstancia();
    System.out.println(LazyHolder);
    LazyHolder = SingletonLazyHolder.getInstancia();
    System.out.println(LazyHolder);
  }
}
