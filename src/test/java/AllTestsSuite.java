import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ getRootTest.class,ConstructorTest.class, DepthNodoTest.class, DepthTest.class, EqualsTest.class, 
		GetSubtreeTest.class, InsertTest.class, IteratorTest.class, SearchTest.class, sizeTest.class, ToListTest.class,
		toStringTest.class })
public class AllTestsSuite {

}
