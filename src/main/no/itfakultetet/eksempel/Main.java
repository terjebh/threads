package no.itfakultetet;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            System.out.println(STR."Vi er nå i tråd: \{Thread.currentThread().getName()} før vi har startet en ny tråd");
            System.out.println(STR."Prioriteten til denne tråden er: \{Thread.currentThread().getPriority()}");
        });

        thread.setName("Ny arbeids-tråd");
        thread.setPriority(Thread.MAX_PRIORITY);

        System.out.println(STR."Vi er i tråd: \{Thread.currentThread().getName()} før vi har startet en ny tråd");
        thread.setUncaughtExceptionHandler( (t, e) -> System.out.println(STR."En kritisk feil har oppstått i tråd \{t.getName()}. Feileen er: \{e.getMessage()}")) ;


        thread.start();
        System.out.println(STR."Vi er i tråd: \{Thread.currentThread().getName()} etter at vi har startet en ny tråd");
        Thread.sleep(10000);



    }
}
