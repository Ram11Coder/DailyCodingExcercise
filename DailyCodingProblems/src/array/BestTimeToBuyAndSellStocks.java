package array;

/**
 * Best time to buy and sell the stock with high profit
 */
public class BestTimeToBuyAndSellStocks {
  public static void main(String[] args) {

    int[] stocks = {3, 5, 2, 1};

    System.out.println(buyAndSellStock(stocks));

    // Recursive sol to be added
  }

  private static int buyAndSellStock(int[] stocks) {
    if (stocks.length < 2)
      return 0;

    int profitSoFarHigh = 0;
    int minStock = stocks[0];
    for (int i = 1; i < stocks.length; i++) {
      profitSoFarHigh = Math.max(profitSoFarHigh, stocks[i] - minStock);
      minStock = Math.min(minStock, stocks[i]);
    }
    return profitSoFarHigh;
  }
}
