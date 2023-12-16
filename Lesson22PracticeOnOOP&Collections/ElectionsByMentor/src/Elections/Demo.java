package Elections;

import Elections.Candidates.Candidate;
import Elections.Candidates.Criminal;
import Elections.Candidates.Politician;
import Elections.Candidates.ShowMan;

import java.util.Random;

public class Demo {

    public static void main(String[] args) {
                /*
        Да се реализира демо на приложението, съдържащо следните функционалности:
            1. Да се създадат 10 кандидата за президент. Всеки кандидат може да е Мутра, Политик или
        Шоумен (по 33% шанс) и да е с произволно образование (50% измежду двете възможни
        образования за мутрите и политиците). Всеки кандидат се създава с произволно име и
        бюджет между 50000 и 300000лв.
            2. Всеки кандидат организира изборна кампания. Политиците имат 50% шанс кампанията
        им да е престъпна или нормална. Кандидатите дават всичките си пари за бюджет на
        кампанията.
            3. Всяка кампания се провежда, като генерира гласоподаватели от произволни градове и
        класи. Всички гласоподаватели се регистрират в централната избирателна комисия като
        списък, групиран по градове.
            4. Провеждане на избори – генериране на гласове от бюлетини във всеки град.
            5. Извеждане на всички статистики от изборите.
         */
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int chance = r.nextInt(100);
            Candidate candidate;
            if (chance < 33) {
                candidate = new ShowMan();
            }
            else if (chance < 66) {
                candidate = new Criminal();
            }
            else {
                candidate = new Politician();
            }
        }
    }

}
