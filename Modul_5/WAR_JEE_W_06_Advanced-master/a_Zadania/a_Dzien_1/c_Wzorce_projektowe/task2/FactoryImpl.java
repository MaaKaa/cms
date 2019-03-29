package a_Zadania.a_Dzien_1.c_Wzorce_projektowe.task2;

class FactoryImpl implements Factory {



    @Override

    public Product createProduct(ProductType type) {

        if (ProductType.SIMPLE == type) {

            return new SimpleProduct();

        } else if (ProductType.ADVANCED == type) {

            return new AdvancedProduct();

        } else if (ProductType.VIRTUAL == type) {

            return new VirtualProduct();

        }



        throw new IllegalProductType(String.format("type %s is invalid", type));

    }



}