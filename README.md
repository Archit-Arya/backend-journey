#Backend Journey

The goal is to create API endpoints used for Notes and keep on adding different features to it 

-27/04<br>
-
-added new Entity Notes having an ID,Date & Content<br>
-uses In-memory storage as of now<br>
-added API endpoints in NotesController<br>
1. Health-Check controller- Used to get status of the server ("/health-check") GET
2. All notes- Returns all notes ("/notes/all") GET
3. Get specific notes- Returns notes by its ID ("/notes/getById/<id>") GET
4. Add new notes- Adds new notes using JSON format in body ("/notes/add") POST
5. Update notes- Updates an already existing note or adds it using JSON format in body ("/notes/update) PUT
6. Delete notes- Deletes an existing note ("/notes/delete/<id>") DELETE

-28/04<br>
-
-added persistent storage for the notes using MongoDB<br>
-organized project structure using Controller, Services, Repository<br>
-added functionality of response code response according to the transaction performed<br>

-29/04<br>
-
-added Junit testcases to Service layer