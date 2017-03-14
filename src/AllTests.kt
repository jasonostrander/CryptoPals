import org.junit.runner.RunWith
import org.junit.runners.Suite

/**
 * Created by j.ostrander on 3/14/17.
 */

@RunWith(Suite::class)
@Suite.SuiteClasses(
        Challenge1::class,
        Challenge2::class,
        Challenge3::class
)
class AllTests