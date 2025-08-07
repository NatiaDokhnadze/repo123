package ge.ourstore.query;

//  ეს კლასი უზრუნველყოფს SQL query-ების გენერაციას ჩვენი ბაზისთვის
public class OurStoreQueryManager {

    // კონსტანტა - აქ შეგვიძლია შევინახოთ თუ დაგვჭირდება შენახვა ტესტ მონაცემების იდენტიფიკატორები
    public static final int TEST_EMPLOYEE_ID = 9999;
    public static final int TEST_CLIENT_ID = 8888;
    public static final int TEST_ORDER_ID = 7777;

    //  კლიენტის დამატების SQL query
    public String getInsertClientQuery() {
        return "INSERT INTO clients (clientNumber, clientName, contactLastName, contactFirstName, phone, addressLine1, city, country) " +
                "VALUES (" + TEST_CLIENT_ID + ", 'Test Client', 'Smith', 'John', '+995599123456', 'Rustaveli Ave 12', 'Tbilisi', 'Georgia');";
    }

    // თანამშრომლის დამატება
    public String getInsertEmployeeQuery() {
        return "INSERT INTO employees (employeeNumber, lastName, firstName, extension, email, officeCode, reportsTo, jobTitle) " +
                "VALUES (" + TEST_EMPLOYEE_ID + ", 'Beridze', 'Giorgi', 'x5678', 'giorgi.beridze@ourstore.ge', '1', 1002, 'Sales Rep');";
    }

    // შეკვეთის დამატება
    public String getInsertOrderQuery() {
        return "INSERT INTO orders (orderNumber, orderDate, requiredDate, status, clientNumber) " +
                "VALUES (" + TEST_ORDER_ID + ", '2025-08-07', '2025-08-15', 'In Process', " + TEST_CLIENT_ID + ");";
    }

    // შეკვეთის დეტალების დამატება
    public String getInsertOrderDetailsQuery() {
        return "INSERT INTO orderdetails (orderNumber, productCode, quantityOrdered, priceEach, orderLineNumber) " +
                "VALUES (" + TEST_ORDER_ID + ", 'S18_1749', 5, 95.99, 1);";
    }

    //  დამატებული კლიენტის წაკითხვა
    public String getSelectClientQuery() {
        return "SELECT * FROM clients WHERE clientNumber = " + TEST_CLIENT_ID + ";";
    }

    //  თანამშრომლის წაკითხვა
    public String getSelectEmployeeQuery() {
        return "SELECT * FROM employees WHERE employeeNumber = " + TEST_EMPLOYEE_ID + ";";
    }

    //  შეკვეთის წაკითხვა
    public String getSelectOrderQuery() {
        return "SELECT * FROM orders WHERE orderNumber = " + TEST_ORDER_ID + ";";
    }

    // შეკვეთის დეტალების წაკითხვა
    public String getSelectOrderDetailsQuery() {
        return "SELECT * FROM orderdetails WHERE orderNumber = " + TEST_ORDER_ID + ";";
    }

    // შეკვეთის დეტალების განახლება (მაგ. რაოდენობის შეცვლა)
    public String getUpdateOrderDetailsQuery() {
        return "UPDATE orderdetails SET quantityOrdered = 10 WHERE orderNumber = " + TEST_ORDER_ID + " AND productCode = 'S18_1749';";
    }

    // ყველა დამატებული ჩანაწერის წაშლა
    public String getDeleteAllRecordsQuery() {
        return  "DELETE FROM orderdetails WHERE orderNumber = " + TEST_ORDER_ID + ";" +
                "DELETE FROM orders WHERE orderNumber = " + TEST_ORDER_ID + ";" +
                "DELETE FROM employees WHERE employeeNumber = " + TEST_EMPLOYEE_ID + ";" +
                "DELETE FROM clients WHERE clientNumber = " + TEST_CLIENT_ID + ";";
    }
}
