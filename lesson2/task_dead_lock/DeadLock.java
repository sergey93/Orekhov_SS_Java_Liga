package com.company;

public class DeadLock {

    static class Friend {
        private final String name;

        public Friend(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
        /**
         * this - тот, кого подстрелили, блокируем только часть кода с его действиями
         */
        public void bow(Friend bower) {
            synchronized (this) {
                System.out.format("%s: %s подстрелил меня!\n", this.name, bower.getName());
                System.out.format("%s: стреляю в ответ!\n", this.name);
            }
            bower.bowBack(this);
        }

        public synchronized void bowBack(Friend bower) {
            System.out.format("%s: %s подстрелил меня!\n", bower.getName(), this.name);
        }
    }

    /**
     * Точка входа в программу
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Friend alphonse = new Friend("Alphonse");
        Friend gaston = new Friend("Gaston");

        new Thread(() -> alphonse.bow(gaston)).start();
        new Thread(() -> gaston.bow(alphonse)).start();
    }
}
