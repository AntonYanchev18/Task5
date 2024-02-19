package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Създаване на масив с 20 елемента от целочислен тип
        int[] array = new int[20];

        // Инициализация на елементите на масива
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 5;
        }

        // Изваждане на елементите на масива в конзолата
        for (int i = 0; i < array.length; i++) {
            System.out.println("Елемент  " + i + ": " + array[i]);
        }

    }
}