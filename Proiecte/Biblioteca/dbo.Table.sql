CREATE TABLE [dbo].[Users]
(
	[Id] INT NOT NULL PRIMARY KEY, 
    [First Name] NVARCHAR(50) NULL, 
    [Last Name] NVARCHAR(50) NULL, 
    [Username] NVARCHAR(50) NULL, 
    [Password] NVARCHAR(50) NULL, 
    [Age] INT NULL, 
    [Email] NVARCHAR(50) NULL, 
    [Phone] NVARCHAR(50) NULL
)
