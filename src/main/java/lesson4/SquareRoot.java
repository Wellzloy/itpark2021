package lesson4;

public class SquareRoot {
    /*Воспользуйтесь процессом усреднения. Он также начинается с поиска двух полных квадратов,
    между которыми находится данное число.[5]
    Затем разделите данное число на квадратный корень из одного из чисел.
    Потом найдите среднее арифметическое данного числа и результата деления
    (в данном случае среднее арифметическое – это сумма двух чисел, деленная на два).
    Затем данное число разделите на среднее арифметическое. Наконец, найдите среднее
    арифметическое последнего результата и первого среднего арифметического.
    Сложно? Не очень, если рассмотреть пример. Дано число 10. Оно находится между
    двумя полными квадратами 9 (3х3 = 9) и 16 (4х4 = 16). Квадратные корни из этих чисел
    равны 3 и 4. Итак, разделите 10 на первое число: 10/3 = 3,33. Теперь найдите среднее
    арифметическое 3 и 3,33: (3+3,33)/2 = 3,1667. Теперь 10 разделите на среднее
    арифметическое: 10/3,1667 = 3,1579. Теперь найдите среднее
    арифметическое 3,1579 и 3,1667: (3,1579+3,1667)/2 = 3,1623.
    Проверьте ответ, умножив его на себя. 3,1623х3,1623 = 10,001 ≈ 10.
    */
}