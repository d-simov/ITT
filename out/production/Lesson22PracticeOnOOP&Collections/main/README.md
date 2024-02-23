#Да се реализира приложение, симулиращо провеждането на избори за президент.

За изборите могат да се кандидатират кандидати. Всеки кандидат има име, образование и пари за кампания.

Кандидатите за президент могат да бъдат:
  Мутра – може да бъде без образование и с основно образование
  Политик – може да бъде със средно образование и с висше образование
  Шоумен – може да бъде както без образование, така и с основно или висше.

Всеки кандидат организира изборна кампания. Кампанията има срок (от дата, до дата) и бюджет, с който разполага. Кампанията на кандидата генерира гласоподаватели, които по-късно ще
гласуват на изборите. Кампаниите се създват за срок между 20 и 25 дни. Кампанията може да бъде нормална кампания, в която кандидатът се промотира легитимно и
законно. Такива кампании могат да правят само политиците и шоумените. Те генерират по 100 гласоподаватели на ден.

Кампанията може да бъде и престъпна кампания. В престъпните кампании се практикуват незаконни приоми и пропагандата е на високо ниво. Такива кампании могат да правят само
мутрите и политиците. Всяка престъпна кампания може да генерира по 120 гласоподавателя на ден, но 50% от тези гласове ще са купени. За всеки купен глас бюджета на престъпната кампания
намалява с между 30 и 50 лева. Ако бюджета на кампанията свърши, то в нея не може да се купуват повече гласове и легитимните гласоподаватели, които се набират на ден, ще са
съответно с 50% по-малко.

Гласоподавателите са поданици на държавата, които могат да гласуват за някой кандидат. Те биват:
  • Неук гласоподавател
  • Средна класа гласоподавател
  • Заможен гласоподавател
Всеки гласоподавател има име, пол, град, кандидат, за който е решил да гласува, както и дали е купен или не.

Гласоподаватели се генерират от избирателните кампании и само те могат да отидат да гласуват.
  • Всички неуки гласоподаватели ще гласуват за кандидата на кампанията, в която са генерирани. 10% от неуките гласоподаватели няма да отидат да гласуват.
  • 70% от генеририраните гласоподаватели от средната класа ще гласуват за кандидата на кампанията, в която са генрирани, а останалите 30% - за рандом друг кандидат. 30% от
гласоподавателите от средната класа няма да отидат да гласуват.
  • 50% от генерираните заможни гласоподаватели ще гласуват за кандидата на кампанията, в която са генерирани, а останалите 50% - за рандом друг кандидат. 50% от заможните
гласоподаватели няма да отидат да гласуват.

За протичането на изборите се грижи централната избирателна комисия. Тя организира секции във всеки град, където гласоподавателите могат да гласуват. Всеки гласоподавател гласува в
секцията на града, в който живее. В секцията има бюлетини, които се раздават на гласоподавателите и се съхраняват след гласуването.

Избирателната комисия може да даде старт на гласуването.
При стартиране на гласуването всеки гласоподавател отива до секцията на своя град и пуска в нея бюлетина с избрания от него кандидат.
  • Неуките гласоподаватели имат 40% шанс да предадат невалидна бюлетина.
  • Гласоподавателите от средна класа имат 10% шанс да предадат невалидна бюлетина.
  • Заможните гласоподаватели няма как да предадат невалидна бюлетина.
След протичане на гласуването във всяка секция се броят гласовете. Гласовете от всяка секция представляват само валидните бюлетини.
Избирателната комисия изработва класиране на кандидатите, като то е групирано по кандидат, а за всеки кандидат – списък с градове и за всеки град – 
броя гласове за този кандидат. Примерен вид на класиране от избори:
    Кандидат Стоев:
      София – 1325 гласа
      Пловдив – 452 гласа
      Велико Търново – 12312 гласа
    Кандидат Томитов
      София – 5345 гласа
      Пловдив – 4131 гласа
      Велико Търново – 546 гласа

След провеждането на изборите избирателната комисия изважда следните статистики:
  1. Победител на изборите – кандидатът, генерирал най-много гласове.
  2. Runner up – кандидатът, на второ място от изборите.
  3. Общо гласували гласоподаватели (брой)
  4. Избирателна активност – процент гласоподаватели, които са гласували спрямо всички генерирани гласоподаватели от кампаниите на кандидатите.
  5. Избирателна активност по градове – класиране на градовете, подредени по процент избирателна активност.
  6. Купени гласове за изборите – процент гласове, които са на купени гласоподаватели спрямо всички подадени гласове.
  7. Невалидни бюлетини – процент невалидни бюлетини спрямо всички подадени бюлетини.
  8. Регистър на кандидатите по градове. Пример:
      София:
        Стефан Станев
        Иван Иванов
      Велико Търново:
        Красен Митрев
        Любомир Стойчев
  9. Любими кандидати на масите – списък с кандидати, за които са гласували най-много хора от съответната класова група. Понеже са три класови групи –
за всяка трябва да се изведе кандидатът, за който най-много хора от тази група са дали гласа си.
  11. Градът с най-много избиратели
  12. Градът с най-малко невалидни бюлетини
  13. Градът с най-много купени гласове
  14. Брой гласове за кандидати без образование, брой гласове за кандидати с основно образование и брой гласове за кандидати с висше образование.

Да се реализира демо на приложението, съдържащо следните функционалности:
    1. Да се създадат 10 кандидата за президент. Всеки кандидат може да е Мутра, Политик или Шоумен (по 33% шанс) и да е с произволно образование (50% измежду двете възможни
образования за мутрите и политиците). Всеки кандидат се създава с произволно име и бюджет между 50000 и 300000лв.
    2. Всеки кандидат организира изборна кампания. Политиците имат 50% шанс кампанията им да е престъпна или нормална. Кандидатите дават всичките си пари за бюджет на
кампанията.
    3. Всяка кампания се провежда, като генерира гласоподаватели от произволни градове и класи. Всички гласоподаватели се регистрират в централната избирателна комисия като
списък, групиран по градове.
    4. Провеждане на избори – генериране на гласове от бюлетини във всеки град.
    5. Извеждане на всички статистики от изборите.