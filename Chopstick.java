package Ushtrime;

import java.util.concurrent.*;
import java.util.*;

class Chopstick {

    private boolean taken = false;

    public synchronized
            void take() throws InterruptedException {
        while (taken) {
            wait();
        }
        taken = true;
    }

    public synchronized void drop() {
        taken = false;
        notifyAll();
    }
}

