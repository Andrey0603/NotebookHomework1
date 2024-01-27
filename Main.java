

import java.util.*;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(new Notebook("Model1", 8, 512, "Windows 10", "Black"));
        notebooks.add(new Notebook("Model2", 16, 1024, "MacOS", "Silver"));
        notebooks.add(new Notebook("Model3", 4, 256, "Ubuntu", "White"));
        notebooks.add(new Notebook("Model4", 12, 1000, "Windows 11", "Red"));
        notebooks.add(new Notebook("Model5", 16, 512, "MacOS", "Blue"));
        notebooks.add(new Notebook("Model6", 8, 1000, "Windows 10", "Silver"));
        
        
        filterNotebooks(notebooks);
    }

    public static void filterNotebooks(Set<Notebook> notebooks) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую необходимому критерию: \n1 - ОЗУ\n2 - Объем ЖД\n3 - Операционная система\n4 - Цвет");
        int criterion = scanner.nextInt();
        Map<Integer, Object> criteria = new HashMap<>();
        
        switch (criterion) {
            case 1:
                System.out.println("Введите минимальный объем ОЗУ:");
                int minRam = scanner.nextInt();
                criteria.put(1, minRam);
                break;
            case 2:
                System.out.println("Введите минимальный объем ЖД:");
                int minHdd = scanner.nextInt();
                criteria.put(2, minHdd);
                break;
            case 3:
                System.out.println("Введите операционную систему:");
                String os = scanner.next();
                criteria.put(3, os);
                break;
            case 4:
                System.out.println("Введите цвет:");
                String color = scanner.next();
                criteria.put(4, color);
                break;
            default:
                System.out.println("Некорректный ввод.");
                return;
        }
        
        for (Notebook notebook : notebooks) {
            if (meetsCriteria(notebook, criteria)) {
                System.out.println("Ноутбук " + notebook.getModel() + " соответствует критериям.");
            }
        }
    }

   
    public static boolean meetsCriteria(Notebook notebook, Map<Integer, Object> criteria) {
        if (criteria.containsKey(1) && notebook.getRamGb() < (int) criteria.get(1)) {
            return false;
        }
        if (criteria.containsKey(2) && notebook.getHddGb() < (int) criteria.get(2)) {
            return false;
        }
        if (criteria.containsKey(3) && !notebook.getOS().equals(criteria.get(3))) {
            return false;
        }
        if (criteria.containsKey(4) && !notebook.getColor().equals(criteria.get(4))) {
            return false;
        }
        return true;
    }


}



