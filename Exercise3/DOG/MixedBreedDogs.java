package DOG;

class MixedBreedDog implements Havanese, Runnable {
    private final Havanese havanese;
    private final Runnable runnable;

    public MixedBreedDog() {
        this.havanese = new Basenji();
        this.runnable = new Rottweiler();
    }

    @Override
    public void bark() {
        havanese.bark();
    }

    @Override
    public void run() {
        runnable.run();
    }
}
