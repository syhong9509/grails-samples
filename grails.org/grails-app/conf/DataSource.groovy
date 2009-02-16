dataSource {
	pooled = false
	driverClassName = "com.mysql.jdbc.Driver"			
	url = "jdbc:mysql://localhost/grails"
	username = "root"
	password = "monlung13"
}
hibernate {
    cache.use_second_level_cache=true
    cache.use_query_cache=true
    cache.provider_class='net.sf.ehcache.hibernate.EhCacheProvider'
}
// environment specific settings
environments {
	development {
		dataSource {
			dbCreate = "update" // one of 'create', 'create-drop','update'
		}
	}
	test {
		dataSource {
			dbCreate = "update"
			url = "jdbc:hsqldb:mem:testDb"
            driverClassName = "org.hsqldb.jdbcDriver"
            username = "sa"
            password = ""
        }
	}
	production {
		dataSource {
			dbCreate = "update"
		}
	}
}
