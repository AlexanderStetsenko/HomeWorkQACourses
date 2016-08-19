package com.company;

import java.util.Arrays;

/**
 * Created by Александр on 15.08.2016.
 */
public class WorkClass2 extends ServiceClass
{

    public void startSecondHomeWork(String[] args)
    {
        System.out.println("");

        System.out.println("Part 2 ");
        System.out.println("");

        System.out.println("");
        System.out.println("Point 1");
        System.out.println("Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.");
        findMaxMinLenghtValue(args);


        System.out.println("");
        System.out.println("Point 2");
        System.out.println("Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.");

        sortByMaxMinNumberOfChars(args);

        System.out.println("");
        System.out.println("Point 3");
        System.out.println("Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.");

        avarageNumberOfChars(args);

        System.out.println("");
        System.out.println("Point 4");
        System.out.println("Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.");

        findValueWithMinSameChars(args);

        System.out.println("");
        System.out.println("Point 5");
        System.out.println("Не понятно задеание(");

        System.out.println("");
        System.out.println("Point 6");
        System.out.println("Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.");
        findValueIncreasedOneByOne(args);


        System.out.println("");
        System.out.println("Point 7");
        System.out.println("Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.");
        findValueContainWithDifferentDigits(args);

        System.out.println("");
        System.out.println("Point 8");
        System.out.println("Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.");
        printMassiveNN(25);

        System.out.println("");
        System.out.println("Point 9");
        System.out.println("Ввести с консоли n-размерность матрицы a [n] [n]. Задать значения элементов матрицы в интервале значений от -n до n с помощью датчика случайных чи-");
        printMassiveNNWithRandomValue(25);

    }



    private void findMaxMinLenghtValue(String[] args)
    {
        int[] values = getIntFromString(args);
        int[] numOfChars = getMassiveOfCharsFromIntMassive(values);

        bubbleSort(values);
        bubbleSort(numOfChars);

        System.out.println("Find Max Min values from Array");
        System.out.println("max value = " + values[values.length - 1] + " num of chars " + numOfChars[numOfChars.length - 1]);
        System.out.println("min value = " + values[0] + " num of chars " + numOfChars[0]);
//        for (int i = 0; i <values.length ; i++) {
//            System.out.println(values[i]);
//        }
    }
    private void sortByMaxMinNumberOfChars(String[] args)
    {
        int[] values = getIntFromString(args);
        int[] numOfChars = getMassiveOfCharsFromIntMassive(values);

        bubbleSort(values);
        bubbleSort(numOfChars);

        System.out.println("Min -> max");

        for (int i = 0; i < values.length ; i++)
        {
            System.out.println("Value " + values[i] + " - > Number of Chars " + numOfChars[i]);
        }
        System.out.println("");
        System.out.println("Max -> min");

        for (int i = values.length - 1; i > 0 ; i--)
        {
            System.out.println("Value " + values[i] + " - > Number of Chars " + numOfChars[i]);
        }
    }
    private void avarageNumberOfChars(String[] args)
    {
        int[] values = getIntFromString(args);
        int[] numOfChars = getMassiveOfCharsFromIntMassive(values);
        int sumOFNumChars = 0;
        int numOfValues = 0;

        for (int i = 0; i < numOfChars.length; i++) // calculate avarage number of chars
        {
            sumOFNumChars += numOfChars[i];
            numOfValues ++;
        }
        double avarageNumOfChars = (double)sumOFNumChars / (double)numOfValues;
        //System.out.println(avarageNumOfChars);
        System.out.println("Values less then avarage");
        for (int i = 0; i < numOfChars.length; i++)
        {
            if(numOfChars[i] < avarageNumOfChars)
            {
               System.out.println("Value " + values[i] + " - > Number of Chars " + numOfChars[i]);
            }
        }
        System.out.println("Values bigger then avarage");
        for (int i = 0; i < numOfChars.length; i++)
        {
            if(numOfChars[i] > avarageNumOfChars)
            {
                System.out.println("Value " + values[i] + " - > Number of Chars " + numOfChars[i]);
            }
        }


    }
    private void findValueWithMinSameChars(String[] args)
    {
        int[] values = getIntFromString(args);
        int[] countArray = new int[values.length];
        int maxValueOfDifferentDigitsIndex = 0;
        int maxValueOfDifferentDigits = 0;

        for (int i = 0; i < values.length; i++)
        {

            int count = 0;
            int[] valueElements = getCharsOfInteger(values[i]);
            for (int j = 0; j < valueElements.length; j++)
            {

                for (int k = j + 1; k < valueElements.length ; k++ )
                {
                    if(valueElements[j] == valueElements[k])
                    {
                        count++;
                    }
                }
            }
            countArray[i] = count;
        }

        for (int j = 0; j < countArray.length; j++)// find element with max value
        {

           if(countArray[j] > maxValueOfDifferentDigits)
           {
               maxValueOfDifferentDigitsIndex = j;
               maxValueOfDifferentDigits = countArray[j];
           }
        }
        System.out.println("Value with least Digits Number");

        System.out.println(values[maxValueOfDifferentDigitsIndex]);

    }
    private void findValueIncreasedOneByOne(String[] args)
    {
        int[] values = getIntFromString(args);
        for(int value : values)
        {
            int[] valuesCharsArray = getCharsOfInteger(value);
            int[] templateArray =  new int[valuesCharsArray.length];
            templateArray = Arrays.copyOfRange(valuesCharsArray, 0, valuesCharsArray.length);
            bubbleSort(templateArray);

            if(Arrays.equals(templateArray, valuesCharsArray) ) {System.out.println(value); break;};

        }
    
    }

    private void findValueContainWithDifferentDigits(String[] args)
    {
        int[] values = getIntFromString(args);
        for(int value : values)
        {
            int[] valuesCharsArray = getCharsOfInteger(value);
            bubbleSort(valuesCharsArray); // if chars are sorted, so same digits will be located one by one
            Boolean sameDigits = true;

            for (int i = 0; i < valuesCharsArray.length - 1 ; i++)
            {

                if(valuesCharsArray[i] == valuesCharsArray[i + 1])
                {
                    sameDigits = true;
                    break;
                }else sameDigits = false;

            }
            if (sameDigits == false){
                System.out.println("Value with diff digits " + value );
                break;
            }
        }
    }


    private void printMassiveNN(int k)
    {
        int n = (int) Math.sqrt(k);
        int[][] workArray = new int[n][n];
        int a = 0;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++) {
                a++;
                workArray[i][j] = a;
                System.out.print(workArray[i][j] + " ");
            }
            System.out.println();

        }

    }

    private void printMassiveNNWithRandomValue(int k)
    {
        int n = (int) Math.sqrt(k);
        int[][] workArray = new int[n][n];

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++) {
                workArray[i][j] = random.nextInt();
                System.out.print(workArray[i][j] + " ");
            }
            System.out.println();

        }
    }







}
