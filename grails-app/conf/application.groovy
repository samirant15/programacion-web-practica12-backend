grails.plugin.springsecurity.password.algorithm = 'bcrypt'

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'com.practica12.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'com.practica12.UserAuthority'
grails.plugin.springsecurity.authority.className = 'com.practica12.Authority'
grails.plugin.springsecurity.controllerAnnotations.interceptUrlMap = [
	[pattern: '/',               access: ['permitAll']],
	[pattern: '/error',          access: ['permitAll']],
	[pattern: '/index',          access: ['permitAll']],
	[pattern: '/index.gsp',      access: ['permitAll']],
	[pattern: '/shutdown',       access: ['permitAll']],
	[pattern: '/assets/**',      access: ['permitAll']],
	[pattern: '/**/js/**',       access: ['permitAll']],
	[pattern: '/**/css/**',      access: ['permitAll']],
	[pattern: '/**/images/**',   access: ['permitAll']],
	[pattern: '/**/favicon.ico', access: ['permitAll']],
	[pattern: '/api/login',      access: ['permitAll']],
	[pattern: '/api/logout',     access: ['isFullyAuthenticated()']],
	[pattern: '/api/product',    access: ['isFullyAuthenticated()']],
	[pattern: '/**',             access: ['isFullyAuthenticated()']]
]

grails.plugin.springsecurity.filterChain.chainMap = [
		[pattern: '/api/**', filters:'JOINED_FILTERS,-anonymousAuthenticationFilter,-exceptionTranslationFilter,-authenticationProcessingFilter,-securityContextPersistenceFilter'],
		[pattern: '/**', filters:'JOINED_FILTERS,-restTokenValidationFilter,-restExceptionTranslationFilter']
]

grails.plugin.springsecurity.rest.login.active = true
grails.plugin.springsecurity.logout.postOnly = false
grails.plugin.springsecurity.rest.logout.endpointUrl = '/api/logout'
grails.plugin.springsecurity.rest.token.storage.jwt.secret = 'dsadsad3kj4j32k4j32k4lj232kljskldjklasdjkla2321312'
grails.plugin.springsecurity.rest.token.storage.jwt.expiration = 3600
grails.plugin.springsecurity.rest.token.validation.useBearerToken = false
grails.plugin.springsecurity.rest.token.validation.headerName = 'X-Auth-Token'
//grails.plugin.springsecurity.rest.token.storage.memcached.hosts = 'localhost:11211'
//grails.plugin.springsecurity.rest.token.storage.memcached.username = 'admin'
//grails.plugin.springsecurity.rest.token.storage.memcached.password = 'admin'
//grails.plugin.springsecurity.rest.token.storage.memcached.expiration = 86400

//grails.plugin.springsecurity.filterChain.chainMap = [
//	[pattern: '/assets/**',      filters: 'none'],
//	[pattern: '/**/js/**',       filters: 'none'],
//	[pattern: '/**/css/**',      filters: 'none'],
//	[pattern: '/**/images/**',   filters: 'none'],
//	[pattern: '/**/favicon.ico', filters: 'none'],
//	[pattern: '/**',             filters: 'JOINED_FILTERS']
//]

