/*
 * This Spock specification was auto generated by running the Gradle 'init' task
 * by 'aya' at '16/06/12 16:12' with Gradle 2.11
 *
 * @author aya, @date 16/06/12 16:12
 */

import spock.lang.Specification

class LibraryTest extends Specification{
    def "someLibraryMethod returns true"() {
        setup:
        Library lib = new Library()
        when:
        def result = lib.someLibraryMethod()
        then:
        result == true
    }
}
