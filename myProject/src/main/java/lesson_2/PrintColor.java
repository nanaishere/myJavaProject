package lesson_2;

public class PrintColor {{
    int value = 108;
    if (value <= 0) {
        System.out.println("Красный");
    } else if (value > 0 && value <= 100) {
        System.out.println("Желтый");
    } else {
        System.out.println("Зеленый");
    }
}
}
