<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method = "html" indent = "yes"/>
	<xsl:template match="/">
		<html>
			<head>
				<title>Utilizando XML com XSLT</title>
				<style>
						.alternado {background-color:#ffffcc}
						.titulo {background-color:#cccccc}               
				</style>
			</head>
			<body>
				<table border="1">
					<tr>
						<th colspan="4">Produtos Cadastrados</th>
					</tr>
					<tr class="titulo">
						<th>ID</th>
						<th>Nome</th>
						<th>Preço</th>
					</tr>	
					<xsl:for-each select="produtos/produto">
						<xsl:element name="tr">
							<xsl:if test="(position( ) mod 2 = 1)">
								<xsl:attribute name="class">
									alternado
								</xsl:attribute>
							</xsl:if>
							<td>
								<xsl:value-of select="id" />
							</td>
							<td>
								<xsl:value-of select="nome" />
							</td>
							<td align="center">
								<xsl:decimal-format name="d" 
									decimal-separator="," 
									grouping-separator="."/>
								<xsl:value-of select="format-number(preco,'R$ #.##0,00','d')" />

							</td>
						</xsl:element>
					</xsl:for-each>
				</table>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>