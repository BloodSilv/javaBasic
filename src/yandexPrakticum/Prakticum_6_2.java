package yandexPrakticum;

public class Prakticum_6_2 {
    public static void main(String[] args) {
            String[] appliances = {"Стиральная машина", "Сушильная машина", "Холодильник", "Утюг", "Посудомоечная машина", "Микроволновая печь", "Варочная поверхность", "Духовой шкаф", "Блендер", "Миксер"}; //Объяви массив наименований бытовой техники

            String outdatedPromotional = appliances[0];  //Присвой переменной outdatedPromotional значение первого элемента
            // Поменяй порядок: присвой первому элементу значение "Духовой шкаф", используя элемент массива с этим наименованием
            appliances[0] = appliances[7];
            // Положи значение outdatedPromotional в элемент, где раньше находился "Духовой шкаф"
            appliances[7] = outdatedPromotional;

            System.out.println("Распродажа -20% на категорию месяца: " + appliances[0]);
        }
    }

