/*
Programmer: Christopher Lebovitz
Assignment: Total Sales

(TOTAL SALES) Use a two-dimensional array to solve the following problem: A company has four salespeople (1 to 4) who sell five different products (1 to 5).
Once a day, each salesperson passes in a slip for each type of product sold. Each slip contains the following:
    1. The salesperson number
    2. The product number
    3. The total dollar value of that product sold that day
Thus, each salesperson passes in between 0 and 5 sales slips per day.


Assume that the information from all the slips for last month is available.
Write an application that will read all this information for last month’s sales and summarize the total sales by salesperson and by product.
All totals should be stored in the two-dimensional array sales.
After processing all the information for last month, display the results in tabular format, with each column representing a salesperson and each row representing a particular product.
Cross-total each row to get the total sales of each product for last month.
Cross-total each column to get the total sales by salesperson for last month.
Your output should include these cross-totals to the right of the totaled rows and to the bottom of the totaled columns
 */


public class Main {

    public static void main(String[] args) {
        // initialize the array with last month's sales
        double[][] sales = {{152.50,135.35,154.20,102.3,50.9},
                            {205.6,60.20,188.12,90.50,900.99},
                            {50.7,60.44,80.60,888.2,166.11},
                            {200.90,500.99,60.6,90.55,100.99}};
        calPrint(sales);
    }

    // method to print and calulate the total sales for employees and for items
    public static void calPrint(double[][]arr){
        double empTotal = 0;
        double itemTotal = 0;

        //formatting code
        System.out.print("Product");
        System.out.println("\t\t1\t\t\t2\t\t\t3\t\t\t4\t\t\t5\t\t\t  |Total Sales|");
        System.out.println("------------------------------------------------------------------------");
        //end formatting

        //nested for loop to display the sales for per items per employee then calculate the total sales for that employee
        for(int row = 0; row < arr.length; row++){
            System.out.printf("Employee: %d|", row +1);
            for(int col = 0; col < arr[row].length; col++) {
                // print out the sales for the employee for each product
                System.out.print(arr[row][col] + "\t\t");
                //count the total sales for each employee
                empTotal += arr[row][col];
            }
            System.out.printf("\t|%.2f|\n",empTotal);
        }
        //end loop
        
        //nested for loop for add up the column to display total dollar about of a particular item sold
        System.out.println("------------------------------------------------------------------------");
        System.out.print("Item Totals");
        for(int col = 0; col < arr[0].length; col++){
            for(int row = 0; row < arr.length; row++){
                itemTotal += arr[row][col];
            }

            System.out.printf("|%.2f|\t  ",itemTotal);
        }
        //end loop
    }

}
