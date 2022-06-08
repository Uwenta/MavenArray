import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();
        int totalAmount = service.getTotalAmount(sales);
        System.out.println("Сумма всех продаж: " + totalAmount);

        int averageAmount = service.getAverageAmount(sales);
        System.out.println("Средняя сумма продаж в месяц: " + averageAmount);

        int maxMonth = service.getMaxMonth(sales);
        System.out.println("Номер месяца, в котором был пик продаж: " + maxMonth);

        int minMonth = service.getMinMonth(sales);
        System.out.println("Номер месяца, в котором был минимум продаж: " + minMonth);

        int monthsLessAverage = service.getMonthsLessAverage(sales);
        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего: " + monthsLessAverage);

        int monthsMoreAverage = service.getMonthsMoreAverage(sales);
        System.out.println("Кол-во месяцев, в которых продажи были выше среднего: " + monthsMoreAverage);


    }
}