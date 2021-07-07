public class Lessen_5 {
    public static void main(String[] args) {
        Worker[] persArry = new Worker[5];
            persArry[0] = new Worker("Иванов Иван Иванович"," Тестировщик", "ivanov@mail.ru",89109999999l,60000,36);
            persArry[1] = new Worker("Петров Петр Петрович", "Разработчик", "petrov@mail.ru", 8910888888l, 100000, 33 );
            persArry[2] = new Worker("Смирнов Сергей Павлович", "менеджер", "smirnov@mail.ru", 89107777777l, 80000, 30);
            persArry[3] = new Worker("Сидоров Степан Петрович", "главбух", "sidorov@mail.ru", 9105555555l, 50000, 55);
            persArry[4] = new Worker("Прокопьев Евлампий Пифонович", "юрист", "prokopev@mail.ru", 89104444444l, 60000, 43);{
            for (int i = 0; i < 5; i++){
                if (persArry[i].age > 40) {
                    persArry[i].workerInfo();
                }
                }
        }



    }
}
