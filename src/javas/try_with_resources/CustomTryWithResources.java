package javas.try_with_resources;

class CustomResource implements AutoCloseable{

    public void doSomething() {
        System.out.println("리소스 작업중입니다.");
    }
    @Override
    public void close() throws Exception {
        System.out.println("리소스가 종료되었습니다.");
    }
}
public class CustomTryWithResources {
    public static void main(String[] args) {
        try(CustomResource resource = new CustomResource()) {
            resource.doSomething();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
