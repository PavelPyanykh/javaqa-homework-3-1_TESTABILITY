public class BonusMilesService {
    public int calculate(int cost) {

        // Расчет количества начисленных бонусных миль за купленный билет

        int mileFare = 20; // количество потраченных рублей на билет, равное одной бонусной миле
        return cost / mileFare; // количество начисленных миль за купленный билет
    }
}
