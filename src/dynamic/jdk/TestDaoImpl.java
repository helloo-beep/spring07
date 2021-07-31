package dynamic.jdk;

public class TestDaoImpl implements TestDao {
    @Override
    public void save() {
        System.out.println("save");
    }

    @Override
    public void modify() {
        System.out.println("modify");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }
}
