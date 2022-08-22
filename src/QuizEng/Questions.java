package QuizEng;

import java.util.Scanner;

public class Questions {
    String[] arr1 = new String[]{"Человека, который работает на дому: например, слесаря", "Ровесника, который вырос в том же городе, где и ты", "Парня или подругу, которые немного странные, но ты их любишь"};
    /* Хочу вложить вопросы в массив, лучше в array, чтоб менять кол-во вопросов или удалять, но ни то ни то не вышло...
    аррай вообще я так понял выполняется в блоках инициализации или хз, но в мейне и в методе выполняет метод .add, а так нет, странно...
    Integer integer1 = Integer.valueOf(arr1[1]);
    Integer integer2 = Integer.valueOf(arr1[2]);
    Integer integer3 = Integer.valueOf(arr1[3]);*/

    String x = "\uD83E\uDD73";
    String y = "\uD83E\uDD7A";
    String str1 = " -Какими тремя буквами мы могли бы тебя поприветствовать?";
    String str2 = " -Кого ты можешь назвать homie?";
    String str3 = " -В английском языке есть устойчивое выражение, которое переводится как «рассказать лучшие сплетни»." +
            " Но дословно оно переводится как «пролить» (spill)… что?";
    String str4 = " -Если кто-то пытается тебя унизить, поддеть или незаметно, но очевидно оскорбить, что он кидает (throw) в твою сторону?";
    String str5 = " -Первое значение глагола slay — «убивать». А что значит, если кто-то сказал, что новый альбом Дуа Липы slayed?";

    String var1 = "1. Coo!        2. Suh!        3. Bae! ";
    String var2 = "1. Человека, который работает на дому: например, слесаря";
    String var3 = "2. Ровесника, который вырос в том же городе, где и ты";
    String var4 = "3. Парня или подругу, которые немного странные, но ты их любишь";
    String var5 = "1. чай (the tea)        2. дождь (rain)        3. ледяную воду (ice water)";
    String var6 = "1. иглы (needles)        2. мяч (a ball)        3. тень (shade)";
    String var7 = "1. Он выдался очень удачным        2. Он выдался очень неудачным        3. Он не вышел";


    public void getAnswer() {
        Scanner sc = new Scanner(System.in);
        System.out.println(str1);
        System.out.println(var1);

        int sum1 = 0;
        int sum2 = 0;

        int answer1 = sc.nextInt();
        if (answer1 == 2) {
            System.out.println("YES! Suh! — сокращение от What's up. Правда, говорят так только те, кто очень устал или очень пьян " + x);
            sum1++;
        } else {
            System.out.println("NO! Правильный ответ: Suh! — сокращение от What's up. Правда, говорят так только те, кто очень устал или очень пьян " + y);
            sum2++;
        }

        System.out.println();
        System.out.println(str2);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);

        int answer2 = sc.nextInt();

        if (answer2 == 3) {
            System.out.println("YES! Парня или подругу, которые немного странные, но ты их любишь " + x);
            sum1++;
        } else {
            System.out.println("NO! Правильный ответ: Парня или подругу, которые немного странные, но ты их любишь" + y);
            sum2++;
        }
        System.out.println(str3);
        System.out.println(var5);

        int answer3 = sc.nextInt();

        if (answer3== 1){
            System.out.println("YES! Spill the tea! — «рассказывай все сплетни!»"+ x);
            sum1++;
        }
        else {
            System.out.println("NO! Правильный ответ: Spill the tea! — «рассказывай все сплетни!" + y);
            sum2++;
        }
        System.out.println(str4);
        System.out.println(var6);

        int answer4 = sc.nextInt();

        if (answer4 == 3){
            System.out.println("YES! Urban Dictionary определяет throwing shade так — «оскорбить кого-то, на самом деле не называя его имени, но давая понять, что вы говорите именно об нем».»"+ x);
            sum1++;
        }
        else {
            System.out.println("NO! Правильный ответ: тень (shade)" + y);
            sum2++;
        }

        System.out.println(str5);
        System.out.println(var7);

        int answer5 = sc.nextInt();

        if (answer5 == 1){
            System.out.println("YES! To slay — быть великолепным, удачным, прекрасным, побить все рекорды и так далее.»"+ x);
            sum1++;
        }
        else {
            System.out.println("NO! Правильный ответ: Он выдался очень удачным" + y);
            sum2++;
        }


        System.out.println("Верных ответов: " + sum1);
        System.out.println("Неверных ответов: " + sum2);
    }

}
