/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicahilos;

import static java.lang.Thread.sleep;

/**
 *
 * @author lfern
 */
public class Hilos {

    public void run() throws InterruptedException {
        String num = "";
        for (int i = 0; i < 10; i++) {
            num = String.valueOf(i);
            sleep(1000);
        }
        num = "";
        for (int i = 0; i < 10; i++) {
            num = String.valueOf(i);
            sleep(1000);
        }
        num = "";
        for (int i = 0; i < 10; i++) {
            num = String.valueOf(i);
            sleep(1000);
        }
    }
}
