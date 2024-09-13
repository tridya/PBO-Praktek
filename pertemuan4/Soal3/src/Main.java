import com.polban.jtk.sales.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // 1. Buat object Product dengan quantity produk 10
        Product laptop = new Product("Laptop", new BigDecimal(14000000), 10);

        // 3. Buat object Sales
        Sales sales = new Sales(laptop);

        // 4. Lakukan penjualan produk dengan quantity 3
        sales.sellProduct(3);

        // 5. Lakukan restock produk dengan menambah 5 unit
        sales.restockProduct(5);

        // 6. Lakukan memperbarui harga produk menjadi 14000000
        sales.updateProductPrice(new BigDecimal(14000000));

        // 7. Coba lakukan memperbaharui harga produk dengan nilai negatif
        sales.updateProductPrice(new BigDecimal(-500000));
    }
}
