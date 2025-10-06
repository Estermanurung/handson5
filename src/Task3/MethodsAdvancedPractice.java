import java.util.Arrays;

public class MethodsAdvancedPractice {

    // Static variable untuk demonstrasi
    private static int counter = 0;

    // Instance variable untuk demonstrasi
    private String instanceName;

    // Constructor
    public MethodsAdvancedPractice(String name) {
        this.instanceName = name;
        counter++;
    }

    public static void main(String[] args) {
        System.out.println("=== METHOD SIGNATURE DAN DECLARATION ===");
        // Latihan 1: Pemanggilan method dengan signature berbeda
        System.out.println("calculate(int,int) = " + calculate(2,3));
        System.out.println("calculate(double,double) = " + calculate(2.5,3.5));
        System.out.println("calculate(int,int,int) = " + calculate(1,2,3));
        System.out.println("calculate(String,String) = " + calculate("Hello ","World"));

        System.out.println("\n=== METHOD OVERLOADING ===");
        print(42);
        print(3.14159);
        print("Ini string");
        print(new int[]{1,2,3,4,5});

        System.out.println("\n=== STATIC VS INSTANCE METHODS ===");
        System.out.println("Counter awal: " + getCounter());
        incrementCounter();
        System.out.println("Counter setelah increment: " + getCounter());

        MethodsAdvancedPractice obj = new MethodsAdvancedPractice("Ester");
        obj.displayInfo();
        obj.setInstanceName("LIN");
        obj.displayInfo();

        System.out.println("\n=== PASS BY VALUE - PRIMITIVES ===");
        int originalNumber = 10;
        System.out.println("Sebelum modifyPrimitive: " + originalNumber);
        modifyPrimitive(originalNumber);
        System.out.println("Sesudah modifyPrimitive: " + originalNumber);

        System.out.println("\n=== PASS BY VALUE OF REFERENCE - OBJECTS ===");
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("Sebelum modifyArray: " + Arrays.toString(originalArray));
        modifyArray(originalArray);
        System.out.println("Sesudah modifyArray: " + Arrays.toString(originalArray));

        int[] anotherArray = {10, 20, 30};
        System.out.println("Sebelum reassignArray: " + Arrays.toString(anotherArray));
        reassignArray(anotherArray);
        System.out.println("Sesudah reassignArray: " + Arrays.toString(anotherArray));

        System.out.println("\n=== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE ===");
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        int[] sorted = sortArrayCopy(numbers);
        System.out.println("Original: " + Arrays.toString(numbers));
        System.out.println("Sorted: " + Arrays.toString(sorted));

        double[] stats = getArrayStats(numbers);
        System.out.printf("Min: %.0f, Max: %.0f, Avg: %.2f%n", stats[0], stats[1], stats[2]);

        int[] merged = mergeArrays(new int[]{1,2,3}, new int[]{4,5,6});
        System.out.println("Merged array: " + Arrays.toString(merged));

        System.out.println("\n=== VARIABLE ARGUMENTS (VARARGS) ===");
        System.out.println("Sum: " + sum(1,2,3,4,5));
        printInfo("Data nilai", 10,20,30);

        System.out.println("\n=== METHOD CHAINING ===");
        Calculator calc = new Calculator(10);
        double result = calc.add(5).multiply(2).subtract(4).getResult();
        System.out.println("Hasil Calculator chaining: " + result);

        System.out.println("\n=== RECURSIVE METHODS ===");
        System.out.println("Factorial 5: " + factorial(5));
        System.out.println("Fibonacci ke-7: " + fibonacci(7));
        int[] searchArray = {1,3,5,7,9};
        System.out.println("Binary search 7: " + binarySearchRecursive(searchArray, 7, 0, searchArray.length-1));

        System.out.println("\n=== UTILITY STATIC METHODS ===");
        System.out.println("Power 2^3 = " + MathUtils.power(2,3));
        System.out.println("Is 17 prime? " + MathUtils.isPrime(17));
        System.out.println("GCD 24 & 36 = " + MathUtils.gcd(24,36));

        System.out.println("Reverse 'Hello' = " + StringUtils.reverse("Hello"));
        System.out.println("Is 'level' palindrome? " + StringUtils.isPalindrome("level"));
        System.out.println("Word count: " + StringUtils.countWords("Halo dunia Java"));

        int[][] matrix = {{1,2},{3,4}};
        ArrayUtils.printMatrix(matrix);
        int[] dupArray = {1,2,2,3,3,3};
        System.out.println("Duplicates: " + Arrays.toString(ArrayUtils.findDuplicates(dupArray)));
        System.out.println("Arrays equal? " + ArrayUtils.areEqual(new int[]{1,2}, new int[]{1,2}));
    }

    // ===== METHOD OVERLOADING EXAMPLES =====
    public static int calculate(int a, int b) { return a+b; }
    public static double calculate(double a, double b) { return a+b; }
    public static int calculate(int a, int b, int c) { return a+b+c; }
    public static String calculate(String a, String b) { return a+b; }

    public static void print(int value) { System.out.println("Integer: " + value); }
    public static void print(double value) { System.out.println("Double: " + value); }
    public static void print(String value) { System.out.println("String: " + value); }
    public static void print(int[] array) { System.out.println("Array: " + Arrays.toString(array)); }

    // ===== STATIC VS INSTANCE METHODS =====
    public static int getCounter() { return counter; }
    public static void incrementCounter() { counter++; }
    public String getInstanceName() { return instanceName; }
    public void setInstanceName(String name) { this.instanceName = name; }
    public void displayInfo() {
        System.out.println("Instance Name: " + instanceName + ", Counter: " + counter);
    }

    // ===== PASS BY VALUE DEMONSTRATIONS =====
    public static void modifyPrimitive(int number) {
        number += 100;
        System.out.println("Dalam modifyPrimitive: " + number);
    }
    public static void modifyArray(int[] array) {
        for(int i=0;i<array.length;i++) array[i] += 10;
    }
    public static void reassignArray(int[] array) {
        array = new int[]{99,99,99};
        System.out.println("Dalam reassignArray: " + Arrays.toString(array));
    }

    // ===== ARRAY METHODS =====
    public static int[] sortArrayCopy(int[] original) {
        int[] copy = Arrays.copyOf(original, original.length);
        Arrays.sort(copy);
        return copy;
    }
    public static double[] getArrayStats(int[] array) {
        int min=array[0], max=array[0], sum=0;
        for(int n: array) { if(n<min) min=n; if(n>max) max=n; sum+=n; }
        double avg = (double)sum/array.length;
        return new double[]{min,max,avg};
    }
    public static int[] mergeArrays(int[] array1,int[] array2) {
        int[] merged = new int[array1.length+array2.length];
        System.arraycopy(array1,0,merged,0,array1.length);
        System.arraycopy(array2,0,merged,array1.length,array2.length);
        return merged;
    }

    // ===== VARIABLE ARGUMENTS (VARARGS) =====
    public static int sum(int... numbers) {
        int total=0;
        for(int n:numbers) total+=n;
        return total;
    }
    public static void printInfo(String title, int... values) {
        System.out.print(title + ": ");
        for(int v: values) System.out.print(v + " ");
        System.out.println();
    }

    // ===== RECURSIVE METHODS =====
    public static long factorial(int n) { return (n<=1)?1:n*factorial(n-1); }
    public static int fibonacci(int n) { return (n<=1)?n:fibonacci(n-1)+fibonacci(n-2); }
    public static int binarySearchRecursive(int[] array,int target,int left,int right) {
        if(left>right) return -1;
        int mid=(left+right)/2;
        if(array[mid]==target) return mid;
        else if(array[mid]>target) return binarySearchRecursive(array,target,left,mid-1);
        else return binarySearchRecursive(array,target,mid+1,right);
    }

    // ===== UTILITY CLASSES (INNER STATIC CLASSES) =====
    public static class MathUtils {
        public static double power(double base, int exponent) { return Math.pow(base,exponent); }
        public static boolean isPrime(int number) {
            if(number<2) return false;
            for(int i=2;i<=Math.sqrt(number);i++) if(number%i==0) return false;
            return true;
        }
        public static int gcd(int a,int b) { return (b==0)?a:gcd(b,a%b); }
    }

    public static class StringUtils {
        public static String reverse(String str) {
            return new StringBuilder(str).reverse().toString();
        }
        public static boolean isPalindrome(String str) {
            return str.equals(reverse(str));
        }
        public static int countWords(String str) {
            return str.trim().split("\\s+").length;
        }
    }

    public static class ArrayUtils {
        public static void printMatrix(int[][] matrix) {
            for(int[] row: matrix) System.out.println(Arrays.toString(row));
        }
        public static int[] findDuplicates(int[] array) {
            return Arrays.stream(array).boxed()
                    .collect(java.util.stream.Collectors.groupingBy(n->n, java.util.stream.Collectors.counting()))
                    .entrySet().stream()
                    .filter(e->e.getValue()>1)
                    .mapToInt(e->e.getKey()).toArray();
        }
        public static boolean areEqual(int[] array1,int[] array2) { return Arrays.equals(array1,array2); }
    }

    // ===== METHOD CHAINING EXAMPLE =====
    public static class Calculator {
        private double value;
        public Calculator(double initial) { this.value=initial; }
        public Calculator add(double n){ value+=n; return this; }
        public Calculator multiply(double n){ value*=n; return this; }
        public Calculator subtract(double n){ value-=n; return this; }
        public double getResult(){ return value; }
    }
}
