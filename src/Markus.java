public class Markus {

    public int cheapestKeyboard(int[] keyboardPrices){
        int minPrice = Integer.MAX_VALUE;

        for (int keyboardPrice: keyboardPrices){
            if (keyboardPrice < minPrice){
                minPrice = keyboardPrice;
            }
        }
        return minPrice;
    }

    public int mostExpensiveItems(int[] keyboardPrices, int[] usbPrices){
        int maxPrice = Integer.MIN_VALUE;

        for (int keyboardPrice: keyboardPrices){
            if (keyboardPrice > maxPrice){
                maxPrice = keyboardPrice;
            }
        }

        for (int usbPrice: usbPrices){
            if (usbPrice > maxPrice){
                maxPrice = usbPrice;
            }
        }

        return maxPrice;
    }

    public int mostExpensiveUsbInBudget(int budget, int[] usbPrices){
        int minDifference = Integer.MAX_VALUE;
        int usbInBudget = 0;

        for (int usbPrice: usbPrices){
            if (Math.abs(budget - usbPrice) < minDifference){
                minDifference = budget - usbPrice;
                usbInBudget = usbPrice;
            }
        }
        return usbInBudget;
    }

}
