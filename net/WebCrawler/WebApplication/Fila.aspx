<%@ Page Title="Contact" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeBehind="Fila.aspx.cs" Inherits="WebApplication.Monitor" %>

<asp:Content runat="server" ID="BodyContent" ContentPlaceHolderID="MainContent">
    <hgroup class="title">
        <h1>Fila</h1>
    </hgroup>

    <asp:Panel ID="Panel1" runat="server">
    </asp:Panel>

    <section class="contact">
        <header>
            <h3>&nbsp;&nbsp;
                <asp:Label ID="lblMensagemFila" runat="server" Font-Bold="True" ForeColor="Red"></asp:Label>
            </h3>
            <p>
                &nbsp;&nbsp;
                &nbsp;
                &nbsp;
                </p>
            <div>
            <asp:Panel ID="pnlFilaMensagem" runat="server" Height="280px" style="margin-top: 0px" Width="992px" BorderColor="Black" BorderStyle="Solid" BorderWidth="1px">
                <br />
                &nbsp;<asp:Label ID="Label1" runat="server" Text="Mensagem"></asp:Label>
                &nbsp;
                <asp:TextBox ID="txtMensagem" runat="server" Width="117px"></asp:TextBox>
                &nbsp;
                <asp:Button ID="btnInserirFila" runat="server" Font-Size="Medium" Height="38px" OnClick="btnInserirFila_Click" Text="Inserir Fila" Width="122px" />
                <asp:Button ID="btnListarFila" runat="server" Height="38px" OnClick="Button3_Click" Text="Listar Fila" Width="112px" />
                <asp:GridView ID="gridMensagemFila" runat="server" CellPadding="4" ForeColor="#333333" GridLines="None" Width="945px">
                    <AlternatingRowStyle BackColor="White" />
                    <EditRowStyle BackColor="#2461BF" />
                    <FooterStyle BackColor="#507CD1" Font-Bold="True" ForeColor="White" />
                    <HeaderStyle BackColor="#507CD1" Font-Bold="True" ForeColor="White" />
                    <PagerStyle BackColor="#2461BF" ForeColor="White" HorizontalAlign="Center" />
                    <RowStyle BackColor="#EFF3FB" />
                    <SelectedRowStyle BackColor="#D1DDF1" Font-Bold="True" ForeColor="#333333" />
                    <SortedAscendingCellStyle BackColor="#F5F7FB" />
                    <SortedAscendingHeaderStyle BackColor="#6D95E1" />
                    <SortedDescendingCellStyle BackColor="#E9EBEF" />
                    <SortedDescendingHeaderStyle BackColor="#4870BE" />
                </asp:GridView>
            </asp:Panel>
            </div>
            <p>&nbsp;</p>
        </header>
    </section>
</asp:Content>