package org.amossoma.jackson.dataformat.lua

import spock.lang.Specification

class LuaMapperTest extends Specification {

    def "test if LuaMapper class exists"() {
        given:
        def luaMapper = new LuaMapper()

        when:

        expect:
        luaMapper
    }

}
