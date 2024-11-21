SELECT EUni.unique_id, E.name FROM Employees AS E
LEFT JOIN EmployeeUNI AS EUni ON E.id = EUni.id
