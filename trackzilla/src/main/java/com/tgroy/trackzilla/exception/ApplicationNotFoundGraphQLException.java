package com.tgroy.trackzilla.exception;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

public class ApplicationNotFoundGraphQLException extends RuntimeException implements GraphQLError {
	
	private static final long serialVersionUID = -658269473915310740L;
	
	private Map<String, Object> extensions = new HashMap<>();

    public ApplicationNotFoundGraphQLException(String message, Long invalidApplicationId) {
        super(message);
        extensions.put("invalidApplicationId", invalidApplicationId);
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public Map<String, Object> getExtensions() {
        return extensions;
    }

    @Override
    public ErrorType getErrorType() {
        return ErrorType.DataFetchingException;
    }
}
