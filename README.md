# db-example

If you like to write new plugin that will use DB its need to copy one of the code templates according you DB (Sqlite.. Apache Derby)

**fermat-db-sqlite-template**

**fermat-db-derby-template** (Not finished yet)

Project is Maven now but for Gradle users it can be translated.

Module **fermat-db-node-plugin-example** is the example of plugin that have Sqlite template with node.db (in the project base directory) that contains nodes_catalog table.
Based on this DB its have generated in target/generated-sources/jooq-sqlite..tables/daos.
If you run maven root project (or fermat-db-node-plugin-example) its have TestNodesCatalogService that insert new record in DB every time.

Using jooq code generation is a guarantee that will not be written manually SQL in java code and this will prevent SQL errors.




