package br.com.mariojp.sample.bookmark.persistence;

import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;

import br.com.mariojp.sample.bookmark.domain.Bookmark;

@PersistenceController
public class BookmarkDAO extends JPACrud<Bookmark, Long> {
	
	private static final long serialVersionUID = 1L;
	
}
