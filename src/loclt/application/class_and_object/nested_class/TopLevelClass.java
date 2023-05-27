package loclt.application.class_and_object.nested_class;

public class TopLevelClass {
    void accessMembers(OuterClass outerClass) {
        System.out.println(outerClass.outerField);
        System.out.println(OuterClass.staticOuterField);
    }
}
